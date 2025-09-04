## The age structure of students
1. Create the age distribution table of 37 students and map 

|  The age  | Quanlity | Percent(%) |Map to 1-100| 
|:---------:|:--------:|:----------:|:---:|  
|    19     |    3     |    8.11    |1-8|
|    23     |    15    |   40.54    |9-49|
|    29     |    14    |   37.84    |50-87|
|    37     |    2     |    5.41    |88-92|
|    45     |    1     |    2.70    |93-95|
|    50     |    2     |    5.41    |96-100|
| **Total** |  **37**  |  **100**   |

2. Initialize a two-dimensional array with initial values are upper threshold of map to 1-100 and the age column
3. Generate random number from 1 to 100 in integer number ->  we get the row which gives the age
4. Search for the correct row to get the matching age, age founded gives an index to the generated ages count table: increment it (by one)
5. Repeat 1000 times to get 1000 the age value  
6. Output the result of the generation (the age, count times, percent)

