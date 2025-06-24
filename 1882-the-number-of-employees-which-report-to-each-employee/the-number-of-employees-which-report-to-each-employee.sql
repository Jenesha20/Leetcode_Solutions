# Write your MySQL query statement below
select e.employee_id,e.name,count(s.employee_id) as reports_count,round(avg(s.age)) as average_age from employees e
join employees s on e.employee_id=s.reports_to group by employee_id order by employee_id;