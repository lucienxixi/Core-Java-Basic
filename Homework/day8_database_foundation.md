#### optimistic lock and pessimistic lock
1. optimistic lock
- Optimistic Locking is a strategy where you read a record, take note of a version number (other methods to do this involve dates, timestamps or checksums/hashes) and check that the version hasn't changed before you write the record back. When you write the record back you filter the update on the version to make sure it's atomic. (i.e. hasn't been updated between when you check the version and write the record to the disk) and update the version in one hit.
- If the record is dirty (i.e. different version to yours) you abort the transaction and the user can re-start it.
- This strategy is most applicable to high-volume systems and three-tier architectures where you do not necessarily maintain a connection to the database for your session. In this situation the client cannot actually maintain database locks as the connections are taken from a pool and you may not be using the same connection from one access to the next.

2. pessimistic lock
- Pessimistic Locking is when you lock the record for your exclusive use until you have finished with it. It has much better integrity than optimistic locking but requires you to be careful with your application design to avoid Deadlocks. To use pessimistic locking you need either a direct connection to the database (as would typically be the case in a two tier client server application) or an externally available transaction ID that can be used independently of the connection.


### transaction
- ACID properties

### how to solve the deadlock
- Eliminate Mutual Exclusion
- Eliminate Hold and wait
- Eliminate No Preemption
- Eliminate Circular Wait

https://www.geeksforgeeks.org/deadlock-prevention/


### live lock (optional)
- Livelock occurs when two or more processes continually repeat the same interaction in response to changes in the other processes without doing any useful work. These processes are not in the waiting state, and they are running concurrently. This is different from a deadlock because in a deadlock all processes are in the waiting state.
  https://www.geeksforgeeks.org/deadlock-starvation-and-livelock/

### Saga

- A saga pattern is a sequence of local transactions where each transaction updates data within a single service. The first transaction in a saga is initiated by an external request corresponding to the system operation, and then each subsequent step is triggered by the completion of the previous one.
