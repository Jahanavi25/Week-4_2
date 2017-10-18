Feature: calculator

Scenario: Automobiles and boats
Given Electric Car
When The vin is 508, the color is red, and it is not a discount day
Then Electric by tesla with VIN 508 is available to rent in red. This monster has a range of 300 and only costs $487.21 unless range exceeded.

Given boat
When The type is yacht with vin 90210 and a range of 6800, and the day is a discount day.
Then Yacht with VIN 90210 is available to rent. This beauty has a range of 6,800 and only costs $52,996.52

Given standard
When The manufacturer is toyota with a vin 75082, a color of blue, and a range of 9800. The day is not a discount day.
Then Standard by toyota with VIN 75082 is available to rent in blue. The beast has a range of 9,800 and only costs $1,915.36

Given Semi truck
When The manufacturer is volvo with a vin 7331 and a range of 498. Today is a discount day.
Then SemiTruck by volvo with VIN 7331 is available to rent in black.This monster has a range of 498 and only costs $6,416.35 unless range exceeded.

Given diesel
When The manufaacturer is Hummer with a vin 764528, in sunburst orange, and a range of 100. Today is a discount day.
Then Diesel by Hummer with VIN 764528 is available to rent in sunburst orange. This beast has a range of 100 and only costs $974,108.30

Given standard 
When The manufacturer is toyota with a vin 75082,a color of blue, and a range of 9800. The day is a discount day.
Then Standard by toyota with VIN 75082 is available to rent in blue. This beast has a range of 9,800 and only costs $1,647.20
