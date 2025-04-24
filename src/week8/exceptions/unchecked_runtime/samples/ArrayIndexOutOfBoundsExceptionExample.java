package week8.exceptions.unchecked_runtime.samples;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException: Dizinin geçersiz bir indeksine erişim yapılmaya çalışıldığında oluşur
        //int[] numbers = {1, 2, 40};
        //System.out.println(numbers[5]); // Bu satırda ArrayIndexOutOfBoundsException meydana gelir


    try {
            // ArrayIndexOutOfBoundsException: Dizinin geçersiz bir indeksine erişim yapılmaya çalışıldığında oluşur
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Bu satırda ArrayIndexOutOfBoundsException meydana gelir
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz dizin indeksi!"); // Exception yakalandığında bu mesajı yazdırır
        }

        System.out.println("uygulama çalışmaya devam etti");
    }


}
