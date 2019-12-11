package p602m.p606b.p607a.p608f;

import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p602m.p606b.p607a.C13448a;
import p602m.p606b.p607a.C13450c;

/* renamed from: m.b.a.f.b */
/* compiled from: JSONParser */
public class C13454b {

    /* renamed from: a */
    private C13456d f29954a = new C13456d(null);

    /* renamed from: b */
    private C13457e f29955b = null;

    /* renamed from: c */
    private int f29956c = 0;

    /* renamed from: a */
    private int m41377a(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        return ((Integer) linkedList.getFirst()).intValue();
    }

    /* renamed from: c */
    private void m41380c() throws C13455c, IOException {
        this.f29955b = this.f29954a.mo34716b();
        if (this.f29955b == null) {
            this.f29955b = new C13457e(-1, null);
        }
    }

    /* renamed from: b */
    public void mo34709b() {
        this.f29955b = null;
        this.f29956c = 0;
    }

    /* renamed from: b */
    public void mo34710b(Reader reader) {
        this.f29954a.mo34714a(reader);
        mo34709b();
    }

    /* renamed from: a */
    public int mo34706a() {
        return this.f29954a.mo34712a();
    }

    /* renamed from: b */
    private Map m41379b(C13453a aVar) {
        if (aVar == null) {
            return new C13450c();
        }
        Map a = aVar.mo34704a();
        if (a == null) {
            a = new C13450c();
        }
        return a;
    }

    /* renamed from: a */
    public Object mo34707a(Reader reader) throws IOException, C13455c {
        return mo34708a(reader, null);
    }

    /* renamed from: a */
    public Object mo34708a(Reader reader, C13453a aVar) throws IOException, C13455c {
        mo34710b(reader);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        do {
            try {
                m41380c();
                int i = this.f29956c;
                if (i != -1) {
                    if (i == 0) {
                        int i2 = this.f29955b.f29978a;
                        if (i2 == 0) {
                            this.f29956c = 1;
                            linkedList.addFirst(new Integer(this.f29956c));
                            linkedList2.addFirst(this.f29955b.f29979b);
                        } else if (i2 == 1) {
                            this.f29956c = 2;
                            linkedList.addFirst(new Integer(this.f29956c));
                            linkedList2.addFirst(m41379b(aVar));
                        } else if (i2 != 3) {
                            this.f29956c = -1;
                        } else {
                            this.f29956c = 3;
                            linkedList.addFirst(new Integer(this.f29956c));
                            linkedList2.addFirst(m41378a(aVar));
                        }
                    } else if (i != 1) {
                        if (i == 2) {
                            int i3 = this.f29955b.f29978a;
                            if (i3 != 0) {
                                if (i3 != 2) {
                                    if (i3 != 5) {
                                        this.f29956c = -1;
                                    }
                                } else if (linkedList2.size() > 1) {
                                    linkedList.removeFirst();
                                    linkedList2.removeFirst();
                                    this.f29956c = m41377a(linkedList);
                                } else {
                                    this.f29956c = 1;
                                }
                            } else if (this.f29955b.f29979b instanceof String) {
                                linkedList2.addFirst((String) this.f29955b.f29979b);
                                this.f29956c = 4;
                                linkedList.addFirst(new Integer(this.f29956c));
                            } else {
                                this.f29956c = -1;
                            }
                        } else if (i == 3) {
                            int i4 = this.f29955b.f29978a;
                            if (i4 == 0) {
                                ((List) linkedList2.getFirst()).add(this.f29955b.f29979b);
                            } else if (i4 == 1) {
                                List list = (List) linkedList2.getFirst();
                                Map b = m41379b(aVar);
                                list.add(b);
                                this.f29956c = 2;
                                linkedList.addFirst(new Integer(this.f29956c));
                                linkedList2.addFirst(b);
                            } else if (i4 == 3) {
                                List list2 = (List) linkedList2.getFirst();
                                List a = m41378a(aVar);
                                list2.add(a);
                                this.f29956c = 3;
                                linkedList.addFirst(new Integer(this.f29956c));
                                linkedList2.addFirst(a);
                            } else if (i4 != 4) {
                                if (i4 != 5) {
                                    this.f29956c = -1;
                                }
                            } else if (linkedList2.size() > 1) {
                                linkedList.removeFirst();
                                linkedList2.removeFirst();
                                this.f29956c = m41377a(linkedList);
                            } else {
                                this.f29956c = 1;
                            }
                        } else if (i == 4) {
                            int i5 = this.f29955b.f29978a;
                            if (i5 == 0) {
                                linkedList.removeFirst();
                                ((Map) linkedList2.getFirst()).put((String) linkedList2.removeFirst(), this.f29955b.f29979b);
                                this.f29956c = m41377a(linkedList);
                            } else if (i5 == 1) {
                                linkedList.removeFirst();
                                String str = (String) linkedList2.removeFirst();
                                Map map = (Map) linkedList2.getFirst();
                                Map b2 = m41379b(aVar);
                                map.put(str, b2);
                                this.f29956c = 2;
                                linkedList.addFirst(new Integer(this.f29956c));
                                linkedList2.addFirst(b2);
                            } else if (i5 == 3) {
                                linkedList.removeFirst();
                                String str2 = (String) linkedList2.removeFirst();
                                Map map2 = (Map) linkedList2.getFirst();
                                List a2 = m41378a(aVar);
                                map2.put(str2, a2);
                                this.f29956c = 3;
                                linkedList.addFirst(new Integer(this.f29956c));
                                linkedList2.addFirst(a2);
                            } else if (i5 != 6) {
                                this.f29956c = -1;
                            }
                        }
                    } else if (this.f29955b.f29978a == -1) {
                        return linkedList2.removeFirst();
                    } else {
                        throw new C13455c(mo34706a(), 1, this.f29955b);
                    }
                    if (this.f29956c == -1) {
                        throw new C13455c(mo34706a(), 1, this.f29955b);
                    }
                } else {
                    throw new C13455c(mo34706a(), 1, this.f29955b);
                }
            } catch (IOException e) {
                throw e;
            }
        } while (this.f29955b.f29978a != -1);
        throw new C13455c(mo34706a(), 1, this.f29955b);
    }

    /* renamed from: a */
    private List m41378a(C13453a aVar) {
        if (aVar == null) {
            return new C13448a();
        }
        List b = aVar.mo34705b();
        if (b == null) {
            b = new C13448a();
        }
        return b;
    }
}
