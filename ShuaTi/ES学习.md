# elasticsearch

1. 安装遇到的问题

   **启动时报错：**

   ![](E:\mine\学习笔记\images\ES\install1.PNG)

解决方法：

在参数的冒号前后加上空格：

```she
# ---------------------------------- Various -----------------------------------
#
# Require explicit names when deleting indices:
#
#action.destructive_requires_name: true    注意下面两个参数，冒号那里要加空格
http.cors.enabled : true
http.cors.allow-origin : "*"
```



2. 启动elasticsearch

   点击安装目录下的elasticsearch.bat脚本即可启动，访问地址 http://localhost:9200

3. 启动Kibana

   进入安装目录下，bin目录中点击kibana.bat启动，访问地址： http://localhost:5601

4. 启动elasticsearch-head插件

   进入安装目录下，执行命令：grunt server  启动，访问地址：http://localhost:9100

5. 启动es-sql-site-standalone

   进入安装目录的site-server目录下，执行命令：node node-server.js   访问地址：http://localhost:8080/index.html




### curl命令

1. 执行查询

   //下面是查询结果发挥两个字段，account_number和balance，

   ```json
   curl -XGET 'localhost:9200/cluster_name/_search?pretty' -d'
   {
       "query": { "match_all": {} },
       "_source": ["account_number", "balance"]
   }'
   ```

2. 查看集群健康状态

   ```json
   curl -XGET 'localhost:9200/_cat/health?v&pretty'
   ```

3. 列出所有索引

   ```json
   curl -XGET 'localhost:9200/_cat/indices?v&pretty'
   ```

4. 创建索引

   ```json
   curl -XPUT 'localhost:9200/customer?pretty&pretty'
   ```

5. 修改数据

   也可以是插入数据，数据存在时会覆盖

   //将所有指定到cluster_name索引，external类型，ID为1中，插入数据以json格式写出。

   ```json
   curl -XPUT 'localhost:9200/cluster_name/external/1?pretty&pretty' -d'
   {
       "name": "John DOE"
   }'
   ```

   










