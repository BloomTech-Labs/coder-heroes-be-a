// conversation_id: 1
insert into conversations (profile_id) values (1);

// conversation_id: 2
insert into conversations (profile_id) values (2);

// conversation_id: 3
insert into conversations (profile_id) values (3);

// conversation_id: 4
insert into conversations (profile_id) values (4);

// conversation_id: 5
insert into conversations (profile_id) values (5);

// conversation_id: 6
insert into conversations (profile_id) values (6);

// conversation_id: 7
insert into conversations (profile_id) values (7);

// conversation_id: 8
insert into conversations (profile_id) values (8);

// message_id: 1
insert into messages (title, read, message, conversation_id, sent_by_profile_id)
    values ('Help with Homework?', true, 'I need the answers to the assignment please.', 7, 1);

// message_id: 2
insert into messages (title, read, message, conversation_id, sent_by_profile_id)
    values ('What''s my grade?', true, 'Hey Ms. Teacher can you tell me my grade?', 7, 5);

// message_id: 3
insert into messages (title, message, conversation_id, sent_by_profile_id)
    values ('When is class?', 'I noticed the time was funky and had to ask.', 8, 4);

// message_id: 4
insert into messages (title, message, conversation_id, sent_by_profile_id)
    values ('Is this a yoga course?', 'How is yoga and coding taught together?', 4, 1);

// message_id: 5
insert into messages (title, message, conversation_id, sent_by_profile_id)
    values ('Where is my achievement?', 'my achievement didn''t pop up when I did course.', 5, 8);