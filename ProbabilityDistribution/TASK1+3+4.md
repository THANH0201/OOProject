##Task 1

### The age structure of students
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

## Task 3
A Singleton pattern class typically follows these characteristics:
Private Constructor: The class has a private constructor to prevent external instantiation of the class.
Static Instance: The class contains a static member that holds the unique instance of the class.
Public Access Method: The class provides a public static method to access the instance, typically named getInstance(), which returns the unique instance(instance = new Singleton())
To call Singleton, use Singleton singleton = Singleton.getInstance();

## Task 4
### Probability Distributions & Real-World Simulation Applications

| **Distribution**       | **Key Characteristics**                                   | **Real-World Example**                                                                                 | **Simulation Use Case**                                                                                 | 
|:-----------------------|:----------------------------------------------------------|:-------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------|
| **Normal**             | Bell-shaped, symmetric around the mean                    | Height, test scores, blood pressure, birth weight, reading ability, job satisfaction                   | Simulating manufacturing errors in a **factory**, average processing time in a **hospital**             | 
| **Uniform**            | All values in a range have equal probability              | Rolling a die, random number selection, Raffle Tickets,Spinning a Spinner, Mathematical Representation | Simulating random wait times in **bank transactions**, resource allocation in a **factory**             | 
| **Exponential**        | Rapid decay, memoryless property                          | Time between machine failures, time between phone calls,Time Between Earthquakes                                               | Simulating time between calls to a **bank hotline**, equipment breakdowns in a **factory**              | 
| **Poisson**            | Number of events in a fixed time interval                 | Number of customers arriving, number of emails received                                                | Simulating customer arrivals at a **bank counter**, patient arrivals at a **clinic**                    | 
| **Triangular**         | Defined minimum, maximum, and most likely value           | Project completion time estimates, cost forecasts                                                      | Simulating order fulfillment time in a **factory**, document processing time in a **bank**              | 
| **Lognormal**          | Skewed right, log of variable is normally distributed     | Stock prices, personal income                                                                          | Simulating price fluctuations in **financial markets**, complex document processing in a **hospital**   | 
| **Bernoulli**          | Two outcomes: success or failure                          | Coin toss, product defect check                                                                        | Simulating defect probability in **production lines**, transaction success at **ATMs**                  | 
| **Binomial**           | Repeated Bernoulli trials                                 | Number of correct answers, number of successes in trials                                               | Simulating number of quality products in a **factory batch**, customer satisfaction in **bank surveys** | 