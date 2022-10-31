// role_id: 1
insert into roles (role_name) values ('super_admin');
// role_id: 2
insert into roles (role_name) values ('admin');
// role_id: 3
insert into roles (role_name) values ('instructor');
// role_id: 4
insert into roles (role_name) values ('parent');
// role_id: 5
insert into roles (role_name) values ('child');

// profiles_id: = 1
insert into profile(email, name, okta_id, role_id, pending)
    values('llama001@maildrop.cc', 'Test001 User', '00ulthapbErVUwVJy4x6', 1, false);

// profiles_id: = 2
insert into profile(email, name, okta_id, role_id, pending)
    values('llama002@maildrop.cc', 'Test002 User', '00ultwew80Onb2vOT4x6', 2, false);

// profiles_id: = 3
insert into profile(email, name, okta_id, role_id, pending)
    values('llama003@maildrop.cc', 'Test003 User', '00ultx74kMUmEW8054x6', 3, false);

// profiles_id: = 4
insert into profile(email, name, okta_id, role_id, pending)
    values('llama004@maildrop.cc', 'Test004 User', '00ultwqjtqt4VCcS24x6', 4, false);

// profiles_id: = 5
insert into profile(email, name, okta_id, role_id, pending)
    values('llama005@maildrop.cc', 'Test005 User', '00ultwz1n9ORpNFc04x6', 5, false);

// profiles_id: = 6
insert into profile(email, name, okta_id, role_id, pending)
    values('llama006@maildrop.cc', 'Test006 User', '00u13omswyZM1xVya4x7', 1, false);

// profiles_id: = 7
insert into profile(email, name, okta_id, role_id, pending)
    values('llama007@maildrop.cc', 'Test007 User', '00u13ol5x1kmKxVJU4x7', 2, false);

// profiles_id: = 8
insert into profile(email, name, okta_id, role_id, pending)
    values('llama008@maildrop.cc', 'Test008 User', '00u13oned0U8XP8Mb4x7', 3, false);