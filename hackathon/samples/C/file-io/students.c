#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// one student may have results corresponding to multiple subjects.

#define STUD_FILE "stud.db"
#define RESULT_FILE "result.db"

typedef struct result {
    int roll;
    char subject[20];
    int marks;
}result_t;

typedef struct student {
    int roll;
    char name[30];
    int std;
}student_t;

void accept_student(student_t *s) {
    printf("Enter roll: ");
    scanf("%d", &s->roll);
    printf("Enter name: ");
    scanf("%s", s->name);
    printf("Enter std: ");
    scanf("%d", &s->std);
}

void display_student(student_t *s) {
    printf("%5d %-20s %4d\n", s->roll, s->name, s->std);
}

void accept_result(result_t *r) {
    printf("Enter roll: ");
    scanf("%d", &r->roll);
    printf("Enter subject: ");
    scanf("%s", r->subject);
    printf("Enter marks: ");
    scanf("%d", &r->marks);
}

void display_result(result_t *r) {
    printf("%5d %-20s %4d\n", r->roll, r->subject, r->marks);
}

void add_student() {
    int cnt;
    student_t s;
    FILE *fp = fopen(STUD_FILE, "ab");
    if(fp == NULL) {
        perror("failed to open students file");
        exit(1);
    }
    accept_student(&s);
    cnt = fwrite(&s, sizeof(student_t), 1, fp);
    printf("Number of students added: %d\n", cnt);
    fclose(fp);
}

void display_students() {
    int cnt;
    student_t s;
    FILE *fp = fopen(STUD_FILE, "rb");
    if(fp == NULL) {
        perror("failed to open students file");
        exit(1);
    }
    while(fread(&s, sizeof(student_t), 1, fp) > 0)
        display_student(&s);
    fclose(fp);
}

void update_student() {
    int cnt, roll, found = 0;
    student_t s;
    FILE *fp = fopen(STUD_FILE, "rb+");
    if(fp == NULL) {
        perror("failed to open students file");
        exit(1);
    }
    printf("Enter roll number of student to be modified: ");
    scanf("%d", &roll);
    while(fread(&s, sizeof(student_t), 1, fp) > 0) {
        if(roll == s.roll) {
            found = 1;
            break;
        }
    }
    if(found) {
        printf("Enter Student's New Info: ");
        accept_student(&s);
        fseek(fp, -(long)sizeof(student_t), SEEK_CUR);
        cnt = fwrite(&s, sizeof(student_t), 1, fp);
        printf("Number of students modified: %d\n", cnt);
    }
    else
        printf("Record Not Found.\n");
    fclose(fp);
}

void delete_student() {
    int cnt, roll, found = 0;
    student_t s;
    FILE *fd, *fp = fopen(STUD_FILE, "rb");
    if(fp == NULL) {
        perror("failed to open students file");
        exit(1);
    }
    fd = fopen("temp.db", "wb");
    if(fp == NULL) {
        perror("failed to open temp students file");
        fclose(fp);
        exit(1);
    }
    printf("Enter roll number of student to be deleted: ");
    scanf("%d", &roll);
    while(fread(&s, sizeof(student_t), 1, fp) > 0) {
        if(roll == s.roll)
            found = 1;
        else
            fwrite(&s, sizeof(student_t), 1, fd);
    }
    fclose(fd);
    fclose(fp);
    if(found) {
        rename("temp.db", STUD_FILE);
        printf("Record Deleted.\n");
    }
    else
        printf("Record Not Found.\n");
    remove("temp.db");
}

void add_student_marks() {
    int cnt;
    result_t r;
    FILE *fp = fopen(RESULT_FILE, "ab");
    if(fp == NULL) {
        perror("failed to open students file");
        exit(1);
    }
    accept_result(&r);
    cnt = fwrite(&r, sizeof(result_t), 1, fp);
    printf("Marks added: %d\n", cnt);
    fclose(fp);
}

int find_student(student_t *s, int roll) {
    int found = 0;
    FILE *fp = fopen(STUD_FILE, "rb");
    if(fp == NULL) {
        perror("failed to open students file");
        exit(1);
    }
    while(fread(s, sizeof(student_t), 1, fp) > 0) {
        if(roll == s->roll) {
            found = 1;
            break;
        }
    }
    fclose(fp);
    return found;
}

void find_student_marks() {
    int found = 0, roll;
    student_t s;
    result_t r;
    FILE *fp;

    printf("Enter roll number of student to be found: ");
    scanf("%d", &roll);
    found = find_student(&s, roll);
    if(!found) {
        printf("Student Not Found.\n");
        return;
    }

    printf("Student Marks:\n");
    fp = fopen(RESULT_FILE, "rb");
    if(fp == NULL) {
        perror("failed to open result file");
        exit(1);
    }
    while(fread(&r, sizeof(result_t), 1, fp) > 0) {
        if(r.roll == s.roll)
            display_result(&r);
    }
    fclose(fp);
}

int main() {
    int choice;
    do {
        printf("\n0. Exit\n1. Add Student\n2. Display All Students\n3. Edit Student\n4. Delete Student\n5. Add Student Marks\n6. Display Student & Marks\nEnter choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            add_student();
            break;
        case 2:
            display_students();
            break;
        case 3:
            update_student();
            break;
        case 4:
            delete_student();
            break;
        case 5:
            add_student_marks();
            break;
        case 6:
            find_student_marks();
            break;
        }
    }while(choice != 0);
    return 0;
}
