import java.util.NoSuchElementException;

class stackBasedOnArray{
        int [] items;
    int size = 0;
    int count = 0;

    public stackBasedOnArray(int size) {
        this.size = size;
        items = new int[size];
    }

    public stackBasedOnArray() {
        size = 100;
        items = new int[size];
    }
    public void push(int value){
        if(size==count)
            creatNewAraay();
       items[count]=value;
       count++;
    }
    public int peek(){
        if(isEmpty())
            throw new NoSuchElementException();
        return items[count-1];

    }
    public int pop(){
        if(isEmpty())
            throw new NoSuchElementException();
        count--;
        return items[count];

    }
    public boolean isEmpty() {
        return count==0;
    }

    private void creatNewAraay() {
        size*=2;
        int [] newArray=new int[size];
        for(int i = 0; i<count; i++)
            newArray[i]=items[i];
        items=newArray;


    }
}
