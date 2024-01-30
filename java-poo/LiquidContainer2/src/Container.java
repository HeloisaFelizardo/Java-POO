public class Container {
    private int liquidAmount;
  
    
    public Container(){
        this.liquidAmount = 0;        
    }
    
    public int contains(){
        return this.liquidAmount;
    }
    
    public void add(int amount){
        if(amount > 0){
            this.liquidAmount += amount;
            if(this.liquidAmount > 100){
                this.liquidAmount = 100;
            }            
        }
    }    
   
    public void remove(int amount){
        if(amount > 0){
            this.liquidAmount -= amount;
            if(this.liquidAmount < 0){
                this.liquidAmount = 0;
            }
        }
    }
    
    @Override
    public String toString(){
        return this.liquidAmount + "/100";
    }
}
