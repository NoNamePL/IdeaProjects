/*
    Преобразование целого числа в двоичного
    шестнадцетиричную и восьмеричную строку
*/

class StringConversions {
    public static void main(String []args) {
        int num = 19648;
        System.out.println(num + " в двоичной форме: " + Integer.toBinaryString(num));
        System.out.println(num + " в восьмиричной форме: " + Integer.toOctalString(num));
        System.out.println(num + " в шестнадцатеричной форме: " + Integer.toHexString(num));
    }
}