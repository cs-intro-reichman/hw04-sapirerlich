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
        // String camelCase=camelCase("Intro to coMPUter sCIEnce ");
        // System.out.println(camelCase);
        int [] allIndexOf=allIndexOf("Hello world",'l');
        System.out.print(allIndexOf);

        
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
        int first_word_len = string.length();
        if (space_index != -1){
            first_word_len = space_index;
        }
        for (int i = 0 ; i < first_word_len ; i++){
                if (string.charAt(i) >= 'A' && string.charAt(i) <='Z'){
                    output = output + (char)(string.charAt(i)+32);
                }
                else{
                    output = output + (char)(string.charAt(i));
                }
            }
        String substring = string.substring(space_index+1);
        while(substring.length()>1){
            space_index = substring.indexOf(" ");
            for (int i = 0 ; i < space_index ; i++){
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

            if (space_index != -1){
                substring = substring.substring(space_index+1);
            }
            else {
                substring = "";
            }
        }
        return output;
    }

    public static int[] allIndexOf (String string, char chr) {
        int[] all_index = new int[string.length()];
        for (int i = 0; i < string.length() ; i++){
            if(string.charAt(i) == chr){
                all_index[i] = i;
            }
        }
        return all_index;
    }
}
