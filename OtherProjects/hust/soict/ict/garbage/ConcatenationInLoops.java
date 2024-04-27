package OtherProjects.hust.soict.ict.garbage;

public class ConcatenationInLoops {

    public static void main(String[] args) {
        Integer r = Integer.valueOf(123); 
        
        long startTime = System.currentTimeMillis();

    
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += String.valueOf(i % 2); 
        }
        System.out.println("String concatenation time: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis(); 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(i % 2);
        }
        s = sb.toString(); 

        System.out.println("StringBuilder concatenation time: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}