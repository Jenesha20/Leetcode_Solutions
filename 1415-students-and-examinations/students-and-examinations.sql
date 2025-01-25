select
s.student_id,s.student_name,s2.subject_name,count(e.subject_name) as attended_exams
from
Students s
cross join
Subjects s2
left join
Examinations e
on
s.student_id=e.student_id and s2.subject_name=e.subject_name
group by
s.student_id,s.student_name,s2.subject_name
order by
s.student_id,s.student_name;
