package org.platform;

public class URLify {
    public static void main(String[] args) {


//        URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
//        has sufficient space at the end to hold the additional characters, and that you are given the "true"
//        length of the string. (Note: If implementing in Java, please use a character array so that you can
//        perform this operation in place.)
        String s = "Mr John Smith    ";
        urlify(s, 13);

    }

    public static void urlify(String s, int trueLength) {
        char[] input = s.toCharArray();

        //

        //count the number of spaces within the true length of the string
        int spacecount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (input[i] == ' ') {
                spacecount++;
            }
        }

        int index = trueLength + (spacecount * 2);

        //move backwards
        for (int j = trueLength -1; j >= 0; j--) {
            if (input[j] == ' ') {
                input[index- 1] = '0';
                input[index- 2] = '2';
                input[index- 3] = '%';
                index -=3;
            } else {
                input[index - 1] = input[j];
                index--;
            }

        }
        System.out.println(input);
    }




}