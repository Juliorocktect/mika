import java.sql.Array;

public class MyString {
    private char data[];
    private int length;

    public MyString(char[] data){
        this.length = length(data);
        this.data = new char[length];
    }
    public void add(char add){
       char newData[] = new char[length+2];
       newData = copy(this.data,newData,length+1);
       this.length++;
       this.data = newData;
    }
    private char[] copy(char[] dataOne,char[] dataTwo,int lengthOfTwo){
        if (dataOne.length > dataTwo.length){
            char[] wrong = {'0'};
            System.out.println("Couldn't copy");
            return wrong;
        }
        else{
            for (int i = 0;i < lengthOfTwo;i++){
                dataTwo[i] = dataOne[i];
            }
            return dataTwo;
        }
    }
    public char at(int index){
        return data[index];
    }
    private int length(char[] data){
        return data.length;
    }
    public boolean compareTo(char[] input){
        boolean bool = false;
        for (int i = 0;i < input.length;i++){
            if (this.data[i] != input[i]){
                bool = false;
                i = input.length;
            }
        }
        return bool;
    }
    public int indexOf(char charackter){
        for (int i = 0;i < length;i++){
            if (this.data[i] == charackter){
                return i;
            }
        }
        System.out.println("no charakter found");
        return 0;
    }
}
