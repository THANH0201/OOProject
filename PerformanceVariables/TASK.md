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
1. Hospital

![Flowchart](https://mermaid.ink/img/pako:eNo9kE1PhDAQhv9KM2eWAC3Q7cHEBW9qjHpy8VBp-Uig3ZQ2fhD-uwVc5zTzPvPOZGaGWgsJDJpBf9YdNxa9lpVCPm7PhZusHqV5R4fDzen88hQz9CzbfrJe25tOK0KFZwlDj85MvWr_ULGh0iPMUKlrq6-mciN3nhCG7vnHLkMArekFMGucDMDvHflawrziCmwnR1kB86mQDXeDraBSi7dduHrTerw6jXZtB6zhw-QrdxHcyrLnreHjv2qkEtIU2ikLDJNsGwJshi9gSUZDjPOc5NgTSuIAvlc1jGMcZZgmKU6TY0KXAH62tVFIj1FMIopjkkeEHtMApOj9wQ_7c7cfL78cnGtk?type=png)

2. Airport

[![](https://mermaid.ink/img/pako:eNo90EtvgzAMAOC_EvlMKyAppDlUGrDjpEndqaWHiJiHBkmVhr1Q__sCZcsp9mfHkSeojEIQUPfms2qldeStKDXx5-mcjzdnBrQXstkcsvPxNRIkb7F6J52-PIqymUjuLfa21N9WyhcqPFFBjmg_ugrJyWhcvVj82TsTJDPSqk43pJFuLYAAGtspEM6OGID_xyDnEKaZS3AtDliC8FeFtRx7V0Kp777tKvXJmOGv05qxaUHUsr_5aLwqP6LoZGPl8J-1qBXa3IzagUiSZHkExARfIOKEbylNU5ZSyhLOogC-5-w2imiYUB7v6C7ex_wewM8yNtzyfRixkNOIpSHj-10AqDpn7Mtj2cvO77-pm3D7?type=png)](https://mermaid.live/edit#pako:eNo90EtvgzAMAOC_EvlMKyAppDlUGrDjpEndqaWHiJiHBkmVhr1Q__sCZcsp9mfHkSeojEIQUPfms2qldeStKDXx5-mcjzdnBrQXstkcsvPxNRIkb7F6J52-PIqymUjuLfa21N9WyhcqPFFBjmg_ugrJyWhcvVj82TsTJDPSqk43pJFuLYAAGtspEM6OGID_xyDnEKaZS3AtDliC8FeFtRx7V0Kp777tKvXJmOGv05qxaUHUsr_5aLwqP6LoZGPl8J-1qBXa3IzagUiSZHkExARfIOKEbylNU5ZSyhLOogC-5-w2imiYUB7v6C7ex_wewM8yNtzyfRixkNOIpSHj-10AqDpn7Mtj2cvO77-pm3D7)

### Task 4: 
Pseudocode for a three-phase simulation  
While (event list not empty)  
//A Phase: Find time of next event and advance the clock to the next event time  
    nextEvent = eventList.getNextEvent()  
    Clock.setTime(nextEvent.time)  
//B Phase: Execute the event  
    Execute event by getting method associated with event type  
    if next_event.type == "arrival"  
        execute_arrival(next_event)  
    ... other event types ...  
//C Phase: Attempt all C-events  
Any C-events performed?  
if yes, execute C-events  
    while c_event_list not empty  
        c_event = c_event_list.get_next_c_event()  
        execute_c_event(c_event)  
if no, Simulation ends?  
    if yes, stop simulation  
    if no, comeback to A phase  

### Task 5: Using the names of the simulator classes, explain the simulator 
1. what A-phase coding means? 
In the A-phase coding, the simulation finds the next event in eventList(EventList class), advances the time  to that event's time, and updates the simulation clock accordingly (Clock class).
2. what B-phase coding means?
In the B-phase coding, Execute event by getting method associated with event type(Event class). 
    if next_event.type == "arrival"
        execute_arrival(next_event) (Arrival class)
    if next_event.type == "departure"
        execute_departure(next_event)
3. what coding C events means?
In the C-phase coding, the simulation checks if there are any C-events in the CEventList class. If there are, it executes them one by one using their associated methods. If not, it checks if the simulation should end or return to the A-phase.
    

   