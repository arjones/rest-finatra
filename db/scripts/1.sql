CREATE TABLE "portfolio"."assets" (
    "id" serial,
    "name" text NOT NULL,
    "transacted_at" timestamp NOT NULL,
    "quantity" integer,
    "price_in_cents" integer,
    PRIMARY KEY ("id")
);
