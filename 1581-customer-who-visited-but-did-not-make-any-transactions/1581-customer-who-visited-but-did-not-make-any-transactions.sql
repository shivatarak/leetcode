# Write your MySQL query statement below
select e.customer_id,count(e.customer_id) as count_no_trans
from Visits e
left join Transactions t
on e.visit_id=t.visit_id
where t.transaction_id is null
group by e.customer_id 
