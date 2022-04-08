### Memcached vs Redis
1. 
- Memcached is a distributed memory caching system designed for ease of use and simplicity and is well-suited as a cache or a session store.
- Redis is an in-memory data structure store that offers a rich set of features. It is useful as a cache, database, message broker, and queue.

2. Replication
- Memcached supports replication with third-party forks like repcached
- Unlike Memcached, Redis provides us functionality to multiply clusters by replicating the primary storage for better scalability and high availability.
3. Transactions
- Memcached doesn't support transactions, although its operations are atomic.
- Redis provides out-of-the-box support for transactions to execute commands.
4. Publish and Subscribe Messaging
- Memcached doesn't support publish/subscribe messaging out-of-the-box.
- Redis, on the other hand, provides functionality to publish and subscribe to messages using pub/sub message queues.

5. Geospatial Support
- Geospatial support is useful for implementing location-based features for our applications.
- Unlike Memcached, Redis comes with special commands to manage real-time geospatial data.

6. Architecture 
- Redis uses a single core and shows better performance than Memcached in storing small datasets when measured in terms of cores.
- Memcached implements a multi-threaded architecture by utilizing multiple cores. Therefore, for storing larger datasets, Memcached can perform better than Redis.
- Another benefit of Memcached's multi-threaded architecture is its high scalability, achieved by utilizing multiple computational resources.
- Redis can scale horizontally via clustering, which is comparatively more complex to set up and operate. Also, we can use Jedis or Lettuce to enable a Redis cluster using a Java application

7. We can certainly conclude that Memcached is a solid choice for solving simple caching problems. However, generally speaking, Redis outperforms Memcached by offering richer functionality and various features that are promising for complex use-cases.

https://www.baeldung.com/memcached-vs-redis
https://aws.amazon.com/elasticache/redis-vs-memcached/


### AWS: ElastiCache
- Amazon ElastiCache is a fully managed, in-memory caching service supporting flexible, real-time use cases. You can use ElastiCache for caching, which accelerates application and database performance, or as a primary data store for use cases that don't require durability like session stores, gaming leaderboards, streaming, and analytics. ElastiCache is compatible with Redis and Memcached.

https://aws.amazon.com/elasticache/

### view vs stored procedure
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

https://stackoverflow.com/questions/5194995/what-is-the-difference-between-a-stored-procedure-and-a-view


### view vs materialized view
1. Key Differences Between View and Materialized View
- The basic difference between View and Materialized View is that Views are not stored physically on the disk. On the other hands, Materialized Views are stored on the disc.
- View can be defined as a virtual table created as a result of the query expression. However, Materialized View is a physical copy, picture or snapshot of the base table.
- A view is always updated as the query creating View executes each time the View is used. On the other hands, Materialized View is updated manually or by applying triggers to it.
- Materialized View responds faster than View as the Materialized View is precomputed.
- Materialized View utilizes the memory space as it stored on the disk whereas, the View is just a display hence it do not require memory space.

https://www.tutorialspoint.com/difference-between-views-and-materialized-views-in-sql#:~:text=Views%20are%20generally%20used%20when,get%20updated%20on%20frequent%20basis.
https://techdifferences.com/difference-between-view-and-materialized-view.html#KeyDifferences