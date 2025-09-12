#include <stdio.h>

int sumArrays(int arr[], int size);

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    int sum = sumArrays(arr, size);
    printf("Sum of arrays: %d\n", sum);
    return 0;
}

int sumArrays(int arr[], int size) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += arr[i];
    }
    return sum;
}
//gcc SumArrays.c -o SumArrays && ./SumArrays