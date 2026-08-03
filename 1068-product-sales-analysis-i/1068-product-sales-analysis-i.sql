# Write your MySQL query statement below
select e.product_name,a.year,a.price
from Sales a
inner join Product e
on a.product_id=e.product_id;
