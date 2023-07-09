def can_complete_circuit(gas, cost):
    n = len(gas)
    start = 0
    total = 0
    tank = 0
    for i in range(n):
        tank += gas[i] - cost[i]
        total += gas[i] - cost[i]

        if tank < 0 :
            start = i+1
            tank = 0
            
    return start if total >= 0 else -1

# Driver code
gas = [1,2,3,4,5]
cost = [3,4,5,1,2]
result = can_complete_circuit(gas, cost)
print("Starting gas station index : ", result)
