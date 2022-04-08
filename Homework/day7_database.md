### memcached vs redis

### AWS: Elastic Cache

### view vs stored procedure
https://stackoverflow.com/questions/5194995/what-is-the-difference-between-a-stored-procedure-and-a-view
1. view
- Does NOT accept parameters
- Can be used as building block in a larger query
- Can contain only one single SELECT query
- Can NOT perform modifications to any table
- But can (sometimes) be used as the target of an INSERT, UPDATE or DELETE statement.

2. stored procedure
- Accepts parameters 
- Can NOT be used as building block in a larger query
- Can contain several statements, loops, IF ELSE, etc.
- Can perform modifications to one or several tables
- Can NOT be used as the target of an INSERT, UPDATE or DELETE statement.


### view vs materialized view
https://www.tutorialspoint.com/difference-between-views-and-materialized-views-in-sql#:~:text=Views%20are%20generally%20used%20when,get%20updated%20on%20frequent%20basis.