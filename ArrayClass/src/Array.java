import java.util.Arrays;

public class Array {

    private int length;
    private int count = 0;
    private int largest;
    private int[] commonElements;

    private int[] items;
    public Array(int length) {
        this.length = length;
        items = new int[length];
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void insert(int value){
        if(items.length == count){
            int[] newItems = new int[count * 2];
            for(int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = value;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i = index; i < count - 1; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int value){
        for(int i = 0; i < items.length; i++)
            if(value == i)
                return i;
        return -1;
    }

    public void print(){
//        System.out.println(Arrays.toString(items));
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public int max() {
        largest = items[0];
        for (int i = 0; i < count; i++)
            if (largest < items[i])
                largest = items[i];
        return largest;
    }

    public int[] intersect() {
        int commonCounter = 0;
        int[] common = new int[count];
        for(int i = 0; i < count - 1; i++) {
            if (items[i] == items[i + 1])
                common[commonCounter++] = items[i];
        }
        commonElements = new int[commonCounter];
        for(int i = 0, j = 0; i < count; i++){
            if(common[i] != 0){
                commonElements[j] = common[i];
                j++;
            }
        }
        return commonElements;
    }

    public void reverse() {
        int[] newItems = new int[count];
        for(int i = 0, j = count - 1; i < count; i++, j--)
            newItems[i] = items[j];
        items = newItems;
    }

    public void insertAt(int item, int index){
        if(index < count)
            items[index] = item;
        else throw new ArrayIndexOutOfBoundsException();
    }

}
