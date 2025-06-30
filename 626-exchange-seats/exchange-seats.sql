# Write your MySQL query statement below
select if(id%2=1 and id+1 in (select id from seat),id+1,if(id%2=0,id-1,id)) as id,student from seat order by id;