# SQL语句学习

**查看表结构**：  desc table_name;



**查询语句**

```sql
SELECT [ALL|DISTINCT] <目标列表达式>[,<目标列表达式>]…
  FROM <表名或视图名>[,<表名或视图名>]…
  [WHERE <条件表达式>]
  [GROUP BY <列名> [HAVING <条件表达式>]]
  [ORDER BY <列名> [ASC|DESC]…]
```



**插入语句**

```sq
-- 插入不存在的数据
INSERT INTO <表名> [(字段名[,字段名]…)] VALUES (常量[,常量]…);
示例：INSERT INTO Student (Name,Age,Gender) VALUES ('Andy',30,'女');

-- 将查询的数据插入到数据表中
INSERT INTO <表名> [(字段名[,字段名]…)] SELECT 查询语句;
```

**更新语句**

```sql
UPDATE <表名> SET 列名=值表达式[,列名=值表达式…] [WHERE 条件表达式]
示例：
-- 将Id在(10,100)的Age加1
UPDATE Student SET Age= Age+1 WHERE Id>10 AND Id<100
```

**删除语句**

```sql
DELETE FROM table_name WHERE [condition];
示例:
DELETE FROM student WHERE id=1;
```



**创建索引**

```sql
CREATE [UNIQUE] [CLUSTER] INDEX <索引名> ON <表名>(<列名>[<次序>][,<列名>[<次序>]]…);
示例：
-- 建立学生表索引：单一字段Id索引倒序
CREATE UNIQUE INDEX INDEX_SId ON Student (Id DESC);
```

**删除索引**

```sql
DROP INDEX <索引名>;
示例：
-- 删除学生表索引 INDEX_SId
DROP INDEX INDEX_SId;
```

* 添加主键

  Alter table tabname add primary key(ID)     #设置某一字段为主键，ID自由设置，主键数据不可重复。





# JSON学习

1. json的基本语法

   书写是 **名称/值** 对，花括号保存对象，方括号保存数组，以逗号分隔

   ```json
   {
       "name":"小明",
       "skills":[
           "Java",
           "PHP",
           "Python"
       ],
       "members":[
       	{
       		"name":"Bob",
       		"age":29
   		}
       ]
   }
   ```

   

   