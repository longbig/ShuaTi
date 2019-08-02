# SpringBoot

#### 1. 自定义简单查询

根据方法名自动生成SQL，语法有：

```java
find**By**  //findByUserName
read**By**  //
query**By*
count**By*
get**By**    //后面跟的是属性名称；

//也可以加上关键字And Or
findByUserNameOrEmail();
//修改，删除，统计
deleteById();
//SQL中的关键字都可以使用
findByUserNameOrderByEmailDesc();
```

**分页查询**

需要传入参数Pageable：

```java
//pageable参数需要先定义；
Pageable pageable = new PageRequest(page, size, sort);
//
Page<User> findAll(Pageable pageable);
```

**限制查询**

```jav
findTopByOrderByAgeDesc();
findFirst10ByLastname();
```















