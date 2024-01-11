public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // String camelCase=camelCase(" tWo    wordS");
        // System.out.println(camelCase);
        // int [] allIndexOf=allIndexOf("Hello world",'l');
        // System.out.print(allIndexOf);


        
    }

    public static String capVowelsLowRest(String string) {
        String output = "";
        for (int i = 0 ; i < string.length() ; i++){
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' ||
            string.charAt(i) == 'o' || string.charAt(i) == 'u'){
                output = output + (char)(string.charAt(i)-32);


            }
            else if (string.charAt(i) == 'A'|| string.charAt(i) == 'E'|| 
            string.charAt(i) == 'I'||
            string.charAt(i) == 'O'|| string.charAt(i) == 'U'){
                output = output + (char)(string.charAt(i));
               


            }
            else if (string.charAt(i)>='A'&& string.charAt(i)<='Z'){
                output = output + (char)(string.charAt(i)+32);


            }
            else {
                output = output + (char)(string.charAt(i));
            }
        }
        return output;
    }

    public static String camelCase (String string) {
        int space_index = string.indexOf(" ");
        String output = "";
        String substring=string;
        String first_word;
        while (space_index==0)
        {
            string=string.substring(space_index+1);
            space_index = string.indexOf(" ");
        }
        if (space_index > 0){
            int first_word_len = string.substring(0,space_index).length();
            first_word =string.substring(0,space_index);
             for (int i = 0 ; i < first_word_len ; i++){
                if (first_word.charAt(i) >= 'A' && first_word.charAt(i) <='Z'){
                    output = output + (char)(first_word.charAt(i)+32);
                }
                else{
                    output = output + (char)(first_word.charAt(i));
                }
            }
        }
        substring = substring.substring(space_index+1);
        while(space_index != -1){
            space_index = substring.indexOf(" ");
           
            int loop_int =0;
            if (space_index == -1){
                loop_int=substring.length();
            }
            else{
                loop_int=space_index;
            }
            for (int i = 0 ; i <loop_int ; i++){
                if (i == 0){
                    if (substring.charAt(i) >= 'a' && substring.charAt(i) <='z'){
                        output = output + (char)(substring.charAt(i)-32);

                    }
                    else{
                        output = output + (char)(substring.charAt(i));
                    }
                }
                else if (substring.charAt(i) >= 'A' && substring.charAt(i) <= 'Z'){
                        output = output + (char)(substring.charAt(i)+32);
                    }
                else {
                    output = output + (char)(substring.charAt(i));
                }
            
            }

            substring = substring.substring(space_index+1);
        }
        return output;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i=0; i<string.length();i++){
            if (string.charAt(i)==chr){
                count++;

            }

        }
        int[] all_index = new int[count];
        int pointer=0;
        for (int i=0; i<string.length();i++){
            if (string.charAt(i)==chr){
                all_index[pointer]=i;
                pointer++;

            }

        }

        return all_index;
    }
}
