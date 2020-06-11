select *
from 20200602_tb_user;
insert into 20200602_tb_user(userId, userName,userCard)
values (null, 'abc','123456789012345679');

set @@autocommit = 0;
rollback;
commit;

update `20200602_tb_user`
set userSex=1
where userId = 1;
update `20200602_tb_user`
set userSex=1
where userId = 2;