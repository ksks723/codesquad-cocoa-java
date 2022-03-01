NAME = push_swap

CC = gcc
CFLAGS = -Wall -Wextra -Werror

SRCS = srcs/main.c \
		srcs/state.c \
		srcs/check.c \
		srcs/parse.c \
		srcs/index.c \
		srcs/operator.c \
		srcs/print.c \
		srcs/sort.c \
		srcs/utils.c
OBJS = $(SRCS:.c=.o)

LIBFT_DIR = libs/libft
LIBFT = $(LIBFT_DIR)/libft.a
LIBFT_FLAGS = -L libs/libft -lft

DEQUE_DIR = libs/deque
DEQUE = $(DEQUE_DIR)/libdeque.a
DEQUE_FLAGS = -L libs/deque -ldeque

INC_FLAGS = -I includes -I $(LIBFT_DIR) -I $(DEQUE_DIR)

%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@ $(INC_FLAGS)

all : $(NAME)

$(LIBFT) :
	@make --silent --directory=$(LIBFT_DIR)

$(DEQUE) :
	@make --silent --directory=$(DEQUE_DIR)

$(NAME) : $(LIBFT) $(DEQUE) $(OBJS)
	$(CC) $(CFLAGS) -o $@ $(OBJS) $(LIBFT_FLAGS) $(DEQUE_FLAGS)

bonus : $(NAME)

clean :
	@make clean --silent --directory=$(LIBFT_DIR)
	@make clean --silent --directory=$(DEQUE_DIR)
	rm -rf $(OBJS)

fclean : clean
	@make fclean --silent --directory=$(LIBFT_DIR)
	@make fclean --silent --directory=$(DEQUE_DIR)
	rm -rf $(NAME)

re :	fclean all

.PHONY : all clean fclean re bonus
