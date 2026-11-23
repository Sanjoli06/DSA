class ProductOfNumbers {
    ArrayList<Integer> arr;
    public ProductOfNumbers() {
        arr=new ArrayList();
    }
    
    public void add(int num) {
        if(num==0) arr=new ArrayList();
        else if(arr.size()>0){
            int last=arr.get(arr.size()-1);
            arr.add(last*num);
        }
        else{
            arr.add(num);
        }
    }
    
    public int getProduct(int k) {
        if(arr.size()<k) return 0;
        int total=arr.get(arr.size()-1);
        if(arr.size()==k) return total;
        else 
            return total/arr.get(arr.size()-k-1);

    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */