public class Main {
    public static void main(String[] args) {
      int length = Integer.parseInt(args[0]);

      for(int i = 0; i < length; ++i){
          char symbol = (char)(Math.random()*26 + 'a');

          System.out.print(symbol + ": ");

          switch (symbol){
              case 'a': case 'e': case 'i': case 'o': case 'u':
              {
                  System.out.println("голосна");
                  break;
              }
              case 'y': case 'w':
              {
                  System.out.println("іноді голосна");
                  break;
              }
              default:
              {
                System.out.println("приголосна");
              }
          }
      }
    }
}