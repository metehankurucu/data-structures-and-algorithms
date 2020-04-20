
public class DynamicArray {
    
    public int length;
    public int capacity;
    public int[] array;

    public DynamicArray(){
        this.length = 0;
        this.capacity = 1;
        this.array = new int[1];
    }

    public void growSize(){

        int[] temp =  null;

        if(length == capacity){
            //new array double capacity 
            temp = new int[capacity * 2];
            //Copy array
            for(int i = 0;i < length; i++){
               temp[i] = array[i];
            }

            array = temp;
            capacity = capacity * 2;
        }
    }


    //append item to last
    public void append(int number){
        if(length == capacity){
            //array full
            growSize();
        }
        array[length] = number;
        length++;
    }


    public void insert(int index,int number){
        if(index < capacity && index >= 0){
            if(length == capacity){
                growSize();
            }
            //move items to insert item to index
            for(int i = length; i > index; i--){
                array[i] = array[i-1]; 
            }
            array[index] = number;
            length++;
        }
    }

    //shrink array (deletes unused indexes)
    public void shrinkSize() 
    { 
        int temp[] = null; 
        if (length > 0) { 
            temp = new int[length];
            //copy array
            for (int i = 0; i < length; i++) { 
                temp[i] = array[i]; 
            }
            
            capacity = length; 
            array = temp; 
        } 
    } 

    /** removes last item */
    public void remove() 
    { 
        if (length > 0) { 
            array[length - 1] = 0; 
            length--; 
        }
    } 

    /** removes given item */
    public void remove(int index) 
    { 
        if(index < capacity && index >= 0){
            if (length > 0) { 
                for (int i = index; i < length - 1; i++) { 
                    array[i] = array[i + 1]; 
                } 
                array[length - 1] = 0; 
                length--; 
            } 
        }
    } 

  
    public static void main(String args[]) 
    { 
        //Example case
        DynamicArray dynamicArray = new DynamicArray(); 
  
        dynamicArray.append(1); 
        dynamicArray.append(2); 
        dynamicArray.append(3); 
        dynamicArray.append(4); 
        dynamicArray.append(5); 
        dynamicArray.append(6); 
        dynamicArray.append(7); 
        dynamicArray.append(8); 
        dynamicArray.append(9); 
  
        System.out.println("Elements of array : "); 
        for (int i = 0; i < dynamicArray.capacity; i++) { 
            System.out.print(dynamicArray.array[i] + " "); 
        } 
  
        System.out.println("\nCapacity of array " + dynamicArray.capacity); 
        System.out.println("Length of array " + dynamicArray.length); 
  
        
    } 
} 