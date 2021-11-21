select*from users where username = 'jimbob';
select post_content from posts where id in (select id from users where username = 'the_gary');
select*from posts where post_status = 'created' and date_created = date_part('year',select(current_timestamp)) and id in (select id from uers where username = 'the_gary');
