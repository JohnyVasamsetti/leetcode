l = [0]
for i in range(1,24):
	s = str(i)
	ss = 0
	for j in s:
		ss += int(j)
	if len(l) > ss:
		l[ss].append(i)
	else:
		l.append([i])
for i in l[1:]:
	print(i)