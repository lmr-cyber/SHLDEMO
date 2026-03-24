# 队列（Queue）结合模拟算法[链表]

## Question

---
A virtual memory management system in an operating system uses First-In-First-Out (FIFO) cache.
When a requested memory page is not in the cache and the cache is full, the page that has been in the cache for the longest duration is removed to make room for the requested page. If the cache is not full, then the requested page can simply be added to the cache. A given page should occur once in the cache at most.
Given the maximum size of the cache and an array of page requests, calculate the number of cache misses. A cache miss occurs when a page is requested but is not found in the cache.
Initially, the cache is empty.
### Input
The first line of the input consists of an positive integer-page_requests size, representing the total number of pages (N).
The second line contains N space-separated positive integers - page_requests[0], page_requests/]. - page_requests[N-1], representing the page requests for N pages.
The last line consists of an integer - max_cache_size, representing the size of the cache.
### Output
Print an integer representing the number of cache misses.
### Note
Assume that the array page_requests contains pages numbered in the range 1-50. A page at index i in page_requests is requested before a page at index i+1.

### Example
```
Input:
6
1 2 1 3 1 2
2
Output
5

Explanation
Cache state as requests come in ordered longest-time-in-cache to shortest-time-in-cache:
1 *
1 2 *
1 2
2 3 *
3 1 *
1 2 *

Asterisk(*) represents a cache miss So the total number of cache misses is 5
```
