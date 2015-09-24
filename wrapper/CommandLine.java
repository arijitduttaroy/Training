public class CommandLine {
    public static void main(String[] args ){
        System.out.println("Binary Conversion\t"+Integer.toBinaryString(Integer.parseInt(args[0])));
        System.out.println("Octal Conversion\t"+Integer.toOctalString(Integer.parseInt(args[0])));
        System.out.println("Hexa Decimal Conversion\t"+Integer.toHexString(Integer.parseInt(args[0])));
   }
}
