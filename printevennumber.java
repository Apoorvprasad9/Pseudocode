//pseudocode 
/*
for i=1 to 10
  if i mod 2<>0 then
  continue
  END if 
  print i
END for   
*/

//code in java
public class printevennumber {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}