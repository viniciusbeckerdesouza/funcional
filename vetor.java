import java.util.Arrays;

public class CompoeFuncoes{
  public static void main(String[] args){
    int[] valores = {11,12,13,14};
    Arrays.stream(valores)
      .filter(numero -> numero % 2 == 0)
      .map(numero -> numero * 2)
      .forEach(numero -> System.out.println(numero));
  }
}