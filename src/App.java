

public class App {
    public static void main(String[] args) throws Exception {
        

check(-412415);

    }
    public static String check(int liczba){

    if(liczba>Integer.MAX_VALUE || liczba<Integer.MIN_VALUE){
            System.out.println("Podana liczba jest zbyt duża, lub zbyt mała, wybierz liczbę z przedziału: "+Integer.MIN_VALUE+"do: "+Integer.MAX_VALUE);
            return null;
    }else{
            String numberToStr = String.valueOf(liczba);
            StringBuilder reversedNumber = new StringBuilder(numberToStr);
            reversedNumber.reverse();
            String resultOfReversal = reversedNumber.toString();

                if(liczba <-10){
                    liczba ++;
                    liczba = Math.abs(liczba);
            
                    while(!numberToStr.equals(resultOfReversal)){

                        numberToStr = String.valueOf(liczba--);          
                        reversedNumber = new StringBuilder(numberToStr);
                        reversedNumber.reverse();
                        resultOfReversal = reversedNumber.toString();
                    }
                        numberToStr = String.valueOf("-"+numberToStr);
                        System.out.println("Palindromem Twojej liczby jest: "+numberToStr);
                        return numberToStr;
                }
                else if(liczba>-10 && liczba <10){
                        System.out.println("Palindromem Twojej liczby jest: "+numberToStr);
                        numberToStr = String.valueOf(liczba);
                        return numberToStr;
                } 
        
                else {
                    liczba ++;
                    while(!numberToStr.equals(resultOfReversal)){
                    
                        numberToStr = String.valueOf(liczba++);          
                        reversedNumber = new StringBuilder(numberToStr);
                        reversedNumber.reverse();
                        resultOfReversal = reversedNumber.toString();
                    }
                    
                        System.out.println("Palindromem Twojej liczby jest: "+numberToStr);
                        return numberToStr;
                }
            }}

}
