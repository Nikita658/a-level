package ua.Bykov.module1;

public class Task1 {
        public static void main(String[] args) {
            int[] numbers = {1, 4, 5, 1, 1, 3};
            System.out.println(findingDifferentElements(numbers));
        }

        private static int findingDifferentElements(int[] numbers) {
            int result;
            int countNumb = 0;
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                countNumb++;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] == numbers[i]) {
                        count++;
                        break;
                    }
                }
            }
            return result = countNumb - count;
        }
    }

