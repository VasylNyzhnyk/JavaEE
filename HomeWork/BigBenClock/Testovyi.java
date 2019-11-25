package com.company.HomWork.BigBenClock;

/*менше число*/
public class Testovyi {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int temp;
        temp = a < b ? b : a;
        System.out.println(temp);
    }
}
