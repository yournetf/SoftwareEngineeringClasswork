package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface{

    String customString;

    @Override
    public String getString() {
        return this.customString;
    }

    @Override
    public void setString(String string) {
        this.customString = string;
    }

    @Override
    public int countNumbers() {

        int counter = 0;

        if(this.customString == null){
            throw new NullPointerException("The current string is null.");
        }

        else if (this.customString.isEmpty()){
            return counter;
        }

        else{
            for (int i = 0; i<this.customString.length(); i++){
                if ( (i==(this.customString.length()-1)) && (Character.isDigit(this.customString.charAt(i)))){
                    counter++;
                    break;
                }

                if( Character.isDigit(this.customString.charAt(i)) && (!(Character.isDigit(this.customString.charAt(i+1)))) ){
                    counter++;
                }
            }
        }
        return counter;
    }

    @Override
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
        StringBuilder answer = new StringBuilder();

        if(n<=0){
            throw new IllegalArgumentException("n cannot be less than or equal to 0");
        }


        else if ( (this.customString == null) && (n>0) ) {
            throw new NullPointerException("The current string is null");
        }




        else {
            int index;

            if (this.customString.isEmpty() || this.customString.length() < n){
                return "";
            }

            if (!startFromEnd){
                index = n-1;
                while(index < this.customString.length()){
                    answer.append(this.customString.charAt(index));
                    index += n;
                }
            }

            else if (startFromEnd) {
                index = this.customString.length()-n;
                while(index >= 0){
                    answer.append(this.customString.charAt(index));
                    index -= n;
                }
                answer.reverse();
            }
        }
        return answer.toString();

    }
    @Override
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {

        if (startPosition>endPosition){
            throw new IllegalArgumentException("End position cannot come before start position");
        }

        else if ((startPosition <= endPosition) && (startPosition<1 || endPosition<1 || startPosition>this.customString.length() ||endPosition>this.customString.length()))  {
            throw new MyIndexOutOfBoundsException("Start position must be greater than 0 and end position must be less than the length of the word");
        }

        else if ((startPosition<=endPosition) && (startPosition>0 && endPosition>0) && (this.customString == null)) {
            throw new NullPointerException("The positions are valid but the string is null!");
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i<this.customString.length(); i++){

            if ( (i<=(endPosition-1)) && (i>=(startPosition-1)) ){
                if (this.customString.charAt(i) == '0'){
                    answer.append("Zero");
                }
                else if (this.customString.charAt(i) == '1') {
                    answer.append("One");
                }
                else if (this.customString.charAt(i) == '2') {
                    answer.append("Two");
                }
                else if (this.customString.charAt(i) == '3') {
                    answer.append("Three");
                }
                else if (this.customString.charAt(i) == '4') {
                    answer.append("Four");
                }
                else if (this.customString.charAt(i) == '5') {
                    answer.append("Five");
                }
                else if (this.customString.charAt(i) == '6') {
                    answer.append("Six");
                }
                else if (this.customString.charAt(i) == '7') {
                    answer.append("Seven");
                }
                else if (this.customString.charAt(i) == '8') {
                    answer.append("Eight");
                }
                else if (this.customString.charAt(i) == '9') {
                    answer.append("Nine");
                }
                else{
                    answer.append(this.customString.charAt(i));
                }
            }

            else{
                answer.append(this.customString.charAt(i));
            }
        }
        this.customString = answer.toString();
    }
}
