class MultipleCatchBlock {
public static void main(String args[]) {

int arr[] = {0, 1, 2};

try {
int temp = arr[1]/arr[0];
} catch (ArithmeticException e) {System.out.println("Cannot divide with 0");}

try {
int temp1 = arr[100];
} catch (ArrayIndexOutOfBoundsException e) {System.out.println("Cannot access more than size of an array");}

try {
String temp2 = "abc";
int temp3 = Integer.parseInt(temp2);
} catch(NumberFormatException e) {System.out.println("Cannot convert into that format");}

}
}