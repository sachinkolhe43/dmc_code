#include <stdio.h>

#define PI 3.142857

void volume_cube() {
    double side, volume;
    printf("Enter side of cube: ");
    scanf("%lf", &side);
    volume = side * side * side;
    printf("Volume of Cube: %.2lf\n", volume);    
}

void volume_cuboid() {
    double length, breadth, height, volume;
    printf("Enter length, breadth and height of cuboid: ");
    scanf("%lf%lf%lf", &length, &breadth, &height);
    volume = length * breadth * height;
    printf("Volume of Cuboid: %.2lf\n", volume);    
}

void volume_cylinder() {
    double radius, height, volume;
    printf("Enter radius and height of cylinder: ");
    scanf("%lf%lf", &radius, &height);
    volume = PI * radius * radius * height;
    printf("Volume of Cylinder: %.2lf\n", volume);    
}

void volume_menu() {
    int choice;
    do {
        printf("\n0. Exit\n1. Cube\n2. Cuboid\n3. Cylinder\nEnter choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            volume_cube();
            break;
        case 2:
            volume_cuboid();
            break;
        case 3:
            volume_cylinder();
            break;
        }
    }while(choice != 0);
}

void perimeter_square() {
    double side, peri;
    printf("Enter side of square: ");
    scanf("%lf", &side);
    peri = 4 * side;
    printf("Perimeter of Square: %.2lf\n", peri);    
}

void perimeter_rectangle() {
    double length, breadth, peri;
    printf("Enter length and breadth of rectangle: ");
    scanf("%lf%lf", &length, &breadth);
    peri = 2 * (length + breadth);
    printf("Perimeter of Rectangle: %.2lf\n", peri);    
}

void perimeter_circle() {
    double radius, peri;
    printf("Enter radius of circle: ");
    scanf("%lf", &radius);
    peri = 2 * PI * radius;
    printf("Circumference of Circle: %.2lf\n", peri);    
}

void perimeter_triangle() {
    double side1, side2, side3, peri;
    printf("Enter three sides of triangle: ");
    scanf("%lf%lf%lf", &side1, &side2, &side3);
    peri = side1 + side2 + side3;
    printf("Perimeter of Triagle: %.2lf\n", peri);    
}

void perimeter_menu() {
    int choice;
    do {
        printf("\n0. Exit\n1. Square\n2. Rectangle\n3. Circle\n4. Triangle\nEnter choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            perimeter_square();
            break;
        case 2:
            perimeter_rectangle();
            break;
        case 3:
            perimeter_circle();
            break;
        case 4:
            perimeter_triangle();
            break;
        }
    }while(choice != 0);
}

void area_square() {
    double side, area;
    printf("Enter side of square: ");
    scanf("%lf", &side);
    area = side * side;
    printf("Area of Square: %.2lf\n", area);    
}

void area_rectangle() {
    double length, breadth, area;
    printf("Enter length and breadth of rectangle: ");
    scanf("%lf%lf", &length, &breadth);
    area = length * breadth;
    printf("Area of Rectangle: %.2lf\n", area);    
}

void area_circle() {
    double radius, area;
    printf("Enter radius of circle: ");
    scanf("%lf", &radius);
    area = PI * radius * radius;
    printf("Area of Circle: %.2lf\n", area);    
}

void area_menu() {
    int choice;
    do {
        printf("\n0. Exit\n1. Square\n2. Rectangle\n3. Circle\nEnter choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            area_square();
            break;
        case 2:
            area_rectangle();
            break;
        case 3:
            area_circle();
            break;
        }
    }while(choice != 0);
}

void main_menu() {
    int choice;
    do {
        printf("\n0. Exit\n1. Area\n2. Perimeter\n3. Volume\nEnter choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            area_menu();
            break;
        case 2:
            perimeter_menu();
            break;
        case 3:
            volume_menu();
            break;
        }
    }while(choice != 0);
}

int main() {
    main_menu();
    return 0;
}