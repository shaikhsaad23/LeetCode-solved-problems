class maxProfit{
public int maxProfit(int[] prices){
if (prices.length()<=1){
return 0;
}
cp=prices[0];
profit=0;
for (int i=1; i<=prices.length(); i++){
int sp=prices[i];
if(sp-cp>profit){
profit = sp-cp;
}
else if(sp<cp){
sp = cp;
}
return profit;
}

public static void main(String []args){
int[] prices={7,1,5,3,6,4};
maxProfit();
}