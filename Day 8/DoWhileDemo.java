/*do while loop
do{
	body of loop;
	i++;

}while(test condition);

*/
class DoWhileDemo {
    public static void main(String args[]) {
        int i = 1;
        do {
            System.out.println("Hello World!");
            i++;
        } while (i <= 10); // Fixed the condition (changed >= to <=)
    }
}
