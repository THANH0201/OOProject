### Task 1: Using an example case (health centre, bank, etc.), discuss the meaning and characterisation of all the performance measures discussed in the lesson material using the concepts of the target system.
Target system:
optimize counter utilization (U)
U = B/T => reduce busy time (B), T is constant
increase service throughput (X)
X = C/T => increase number of clients serviced (C)
Reduce response time (R)
R = W/C => reduce waiting time (W)
=> increase support staff to service clients faster.

### Task 2:  Consider the categories in which performance measures are maintained/updated/computed. (Think in general terms: service point/customer; not in target system terms.)
1. Maintained: A, C, B, T, R, W
These are variables that are directly recorded and stored during system operation. They represent raw data such as customer counts, service time, and response time.
2. Updated: A,C,B,R,W 
These variables are continuously updated as events occur: customers arrive, are served, service time changes, and individual response times are recorded.
3. Computed: U, X, R, N
These are derived variables calculated from the maintained and updated data. They reflect overall performance such as utilization, throughput, and average times.

### Task 3:  Design two different systems of three or four service points for a real-world destination. Use real-world concepts. Draw diagrams using the graphical representation of a service point shown in section ´Performance Variables´.
1. graph TD
   A[Hình Vuông] --> B((Hình Tròn))
   B --> C{Quyết định}
   C -->|Có| D[Tiếp tục]
   C -->|Không| E[Kết thúc]