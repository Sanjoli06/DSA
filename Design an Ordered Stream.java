class OrderedStream {
    String[] arr;
     int size;
    public OrderedStream(int n) {
        arr = new String[n];
        size=n;
    }

    public List<String> insert(int idKey, String value) { 
        arr[idKey-1]=value;
        ArrayList<String> temp=new ArrayList();

        for(int i=0;i<idKey-1;i++){
            if(arr[i]==null) return temp;
        }

        for(int i=idKey-1;i<size;i++){
            if(arr[i]!=null) temp.add(arr[i]);
            else break;
        }

        return temp;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */