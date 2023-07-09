public class GasStation
{
    public static int canCompleteCircuit(int[] gas, int[] cost)
    {
        int totalGas     = 0; //total gas collected.
        int currentGas   = 0;
        int startStation = 0;

        for (int i =0; i < gas.length; i++){
            int fuel = gas[i] - cost[i]; //gas available at the station after traveling to next station
            totalGas += fuel; 
            currentGas += fuel;
            
            if(currentGas < 0){
                startStation = i+1;
                currentGas   =0;
            }
        }
        // if totalGas is negative, not possible to complete the circuit
        return totalGas < 0 ? -1 : startStation;
    }

    // Driver Code 
    public static void main(String[] args){
        int[] gas  = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int startStation = canCompleteCircuit(gas, cost);

        if (startStation != -1){ System.out.println("Start station Index : " + startStation);}
        else{System.out.println("Cannot complete the circuit");}
    }
}