# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table answer (
  id                        bigint not null,
  first_word                varchar(20),
  second_word               varchar(20),
  third_word                varchar(20),
  used_time                 double,
  countdown_result          integer(3),
  user_username             varchar(20),
  quiz_id                   bigint,
  constraint pk_answer primary key (id))
;

create table experiment_schedule (
  id                        bigint not null,
  name                      varchar(30) not null,
  no_of_trial               integer(2) not null,
  start_date                timestamp not null,
  expire_date               timestamp not null,
  experiment_type           integer,
  constraint ck_experiment_schedule_experiment_type check (experiment_type in (0)),
  constraint pk_experiment_schedule primary key (id))
;

create table question (
  id                        bigint not null,
  first_word                varchar(20) not null,
  second_word               varchar(20) not null,
  third_word                varchar(20) not null,
  constraint pk_question primary key (id))
;

create table quiz (
  id                        bigint not null,
  init_countdown            integer(3),
  flash_time                integer(20),
  trial_id                  bigint,
  question_id               bigint,
  constraint pk_quiz primary key (id))
;

create table time_log (
  id                        bigint not null,
  start_time                timestamp,
  end_time                  timestamp,
  user_username             varchar(20),
  trial_id                  bigint,
  constraint pk_time_log primary key (id))
;

create table trial (
  id                        bigint not null,
  trigram_type              varchar(20) not null,
  trigram_language          varchar(20) not null,
  schedule_id               bigint,
  constraint pk_trial primary key (id))
;

create table user (
  username                  varchar(20) not null,
  password                  varchar(20) not null,
  status                    integer,
  constraint ck_user_status check (status in (0,1,2,3)),
  constraint pk_user primary key (username))
;

create sequence answer_seq;

create sequence experiment_schedule_seq;

create sequence question_seq;

create sequence quiz_seq;

create sequence time_log_seq;

create sequence trial_seq;

create sequence user_seq;

alter table answer add constraint fk_answer_user_1 foreign key (user_username) references user (username) on delete restrict on update restrict;
create index ix_answer_user_1 on answer (user_username);
alter table answer add constraint fk_answer_quiz_2 foreign key (quiz_id) references quiz (id) on delete restrict on update restrict;
create index ix_answer_quiz_2 on answer (quiz_id);
alter table quiz add constraint fk_quiz_trial_3 foreign key (trial_id) references trial (id) on delete restrict on update restrict;
create index ix_quiz_trial_3 on quiz (trial_id);
alter table quiz add constraint fk_quiz_question_4 foreign key (question_id) references question (id) on delete restrict on update restrict;
create index ix_quiz_question_4 on quiz (question_id);
alter table time_log add constraint fk_time_log_user_5 foreign key (user_username) references user (username) on delete restrict on update restrict;
create index ix_time_log_user_5 on time_log (user_username);
alter table time_log add constraint fk_time_log_trial_6 foreign key (trial_id) references trial (id) on delete restrict on update restrict;
create index ix_time_log_trial_6 on time_log (trial_id);
alter table trial add constraint fk_trial_schedule_7 foreign key (schedule_id) references experiment_schedule (id) on delete restrict on update restrict;
create index ix_trial_schedule_7 on trial (schedule_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists answer;

drop table if exists experiment_schedule;

drop table if exists question;

drop table if exists quiz;

drop table if exists time_log;

drop table if exists trial;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists answer_seq;

drop sequence if exists experiment_schedule_seq;

drop sequence if exists question_seq;

drop sequence if exists quiz_seq;

drop sequence if exists time_log_seq;

drop sequence if exists trial_seq;

drop sequence if exists user_seq;

